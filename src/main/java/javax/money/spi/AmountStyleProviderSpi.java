/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE CONDITION THAT YOU
 * ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT. PLEASE READ THE TERMS AND CONDITIONS OF THIS
 * AGREEMENT CAREFULLY. BY DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF
 * THE AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE" BUTTON AT THE
 * BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency API ("Specification") Copyright
 * (c) 2012-2013, Credit Suisse All rights reserved.
 */
package javax.money.spi;

import java.util.Collection;
import java.util.Locale;
import java.util.Set;

import javax.money.format.AmountStyle;

/**
 * SPI providing {@link AmountStyle} instances. 
 * <p>
 * <h3>Implementation specification</h3>
 * Instances of this interfaces must be
 * <ul>
 * <li>thread-safe
 * </ul>
 * Instances of this interfaces can deliver different results for different runtime scenarios
 * (behave contextual dependent).
 * 
 * @author Anatole Tresch
 */
public interface AmountStyleProviderSpi {

	/**
	 * Get an {@link AmountStyle} for the given {@link Locale}.
	 * 
	 * @param locale
	 *            The target {@link Locale}, not {@code null}.
	 * @return An according {@link AmountStyle} instance, or {@code null}, which delegates
	 *         the request to subsequent {@link AmountStyleProviderSpi} instances
	 *         registered.
	 */
	public AmountStyle getAmountStyle(Locale locale);

	/**
	 * Access the locales supported by this instance.
	 * 
	 * @return the {@link Locale} instances, never {@code null}.
	 */
	public Collection<Locale> getSupportedLocales();

}