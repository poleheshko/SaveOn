package pl.saveon.app.core.domain

sealed interface Result<out D, out E : Error> {
    data class Success<out D>(val data: D) : Result<D, Nothing>
    data class Error<out E : pl.saveon.app.core.domain.Error>(val error: E) : Result<Nothing, E>
}

inline fun <T, E : Error, R> Result<T, E>.map(transform: (T) -> R): Result<R, E> = when (this) {
    is Result.Success -> Result.Success(transform(data))
    is Result.Error -> Result.Error(error)
}

inline fun <T, E : Error> Result<T, E>.onSuccess(action: (T) -> Unit): Result<T, E> = apply {
    if (this is Result.Success) action(data)
}

inline fun <T, E : Error> Result<T, E>.onError(action: (E) -> Unit): Result<T, E> = apply {
    if (this is Result.Error) action(error)
}

typealias EmptyResult<E> = Result<Unit, E>