package ru.ccf.core.di.impl.exception

/**
 * Exception for [ApiRegistry]
 *
 * @see ApiRegistry
 *
 * @author Egor Danilov
 */
class ResolverNotInstalledException(override val message: String) : RuntimeException()
