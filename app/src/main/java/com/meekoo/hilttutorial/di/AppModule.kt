package com.meekoo.hilttutorial.di

import android.content.Context
import com.meekoo.hilttutorial.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Ajay Verma on 24/03/22.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    const val NAMED_QUALIFIER_STRING_1 = "String_1"
    const val NAMED_QUALIFIER_STRING_2 = "String_2"

    @Provides
    @Singleton
    @Named(NAMED_QUALIFIER_STRING_1)
    fun provideStringTextFromResource1(@ApplicationContext context: Context) = "Using Named: " + context.getString(R.string.text_1)

    @Provides
    @Singleton
    @Named(NAMED_QUALIFIER_STRING_2)
    fun provideStringTextFromResource2() = "String 2 : provideStringTextFromResource2()"
}
