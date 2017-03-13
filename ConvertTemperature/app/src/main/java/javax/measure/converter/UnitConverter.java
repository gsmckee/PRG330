/**
 * JEAN-MARIE DAUTELLE, WERNER KEIL ARE WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE CONDITION THAT YOU ACCEPT ALL OF THE TERMS CONTAINED IN THIS LICENSE AGREEMENT ("AGREEMENT"). PLEASE READ THE TERMS AND CONDITIONS OF THIS AGREEMENT CAREFULLY. BY DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF THIS AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY THEM, SELECT THE "DECLINE" BUTTON AT THE BOTTOM OF THIS PAGE AND THE DOWNLOADING PROCESS WILL NOT CONTINUE.
 *
 * Specification: JSR 275 - Units Specification ("Specification")
 *
 * Version: 0.9.4
 * Status: Pre-FCS Public Release
 * Release: December 4, 2009
 *
 * Copyright 2005-2009 Jean-Marie Dautelle, Werner Keil
 * All rights reserved.
 *
 *
 * NOTICE
 *
 * The Specification is protected by copyright and the information described therein may be protected by one or more U.S. patents, foreign patents, or pending applications. Except as provided under the following license, no part of the Specification may be reproduced in any form by any means without the prior written authorization of Jean-Marie Dautelle, Werner Keil and its
 * licensors, if any. Any use of the Specification and the information described therein will be governed by the terms and conditions of this Agreement.
 *
 *
 * Subject to the terms and conditions of this license, including your compliance with Paragraphs 1, 2 and 3 below, Jean-Marie Dautelle and Werner Keil hereby grant you a fully-paid, non-exclusive, non-transferable, limited license (without the right to sublicense) under Jean-Marie Dautelle and Werner Keil's intellectual property rights to:
 *
 *    1. Review the Specification for the purposes of evaluation. This includes: (i) developing implementations of the Specification for your internal, non-commercial use; (ii) discussing the Specification with any third party; and (iii) excerpting brief portions of the Specification in oral or written communications which discuss the Specification provided that such excerpts do not in the aggregate constitute a significant portion of the Specification.
 *
 *    2. Distribute implementations of the Specification to third parties for their testing and evaluation use, provided that any such implementation:
 *
 * (i) does not modify, subset, superset or otherwise extend the Licensor Name Space, or include any public or protected packages, classes, Java interfaces, fields or methods within the Licensor Name Space other than those required/authorized by the Specification or Specifications being implemented;
 *
 * (ii) is clearly and prominently marked with the word "UNTESTED" or "EARLY ACCESS" or "INCOMPATIBLE" or "UNSTABLE" or "BETA" in any list of available builds and in proximity to every link initiating its download, where the list or link is under Licensee's control; and
 *
 * (iii) includes the following notice:
 * "This is an implementation of an early-draft specification developed under the Java Community Process (JCP) and is made available for testing and evaluation purposes only. The code is not compatible with any specification of the JCP."
 *
 *    3. Distribute applications written to the Specification to third parties for their testing and evaluation use, provided that any such application includes the following notice:
 *       "This is an application written to interoperate with an early-draft specification developed under the Java Community Process (JCP) and is made available for testing and evaluation purposes only. The code is not compatible with any specification of the JCP."
 *
 * The grant set forth above concerning your distribution of implementations of the Specification is contingent upon your agreement to terminate development and distribution of your implementation of early draft upon final completion of the Specification.  If you fail to do so, the foregoing grant shall be considered null and void.
 *
 * Other than this limited license, you acquire no right, title or interest in or to the Specification or any other Jean-Marie Dautelle and Werner Keil intellectual property, and the Specification may only be used in accordance with the license terms set forth herein. This license will expire on the earlier of:  (a) two (2) years from the date of Release listed above; (b) the date on which the final version of the Specification is publicly released; or (c) the date on which the Java Specification Request (JSR) to which the Specification corresponds is withdrawn.  In addition, this license will terminate immediately without notice from Jean-Marie Dautelle, Werner Keil if you fail to comply with any provision of this license.  Upon termination, you must cease use of or destroy the Specification.
 *
 * "Licensor Name Space" means the public class or interface declarations whose names begin with "java", "javax", "org.jscience" or their equivalents in any subsequent naming convention adopted through the Java Community Process, or any recognized successors or replacements thereof
 *
 *
 * TRADEMARKS
 *
 * No right, title, or interest in or to any trademarks, service marks, or trade names of Jean-Marie Dautelle, Werner Keil or Jean-Marie Dautelle and Werner Keil's licensors is granted hereunder. Java and Java-related logos, marks and names are trademarks or registered trademarks of Sun Microsystems, Inc. in the U.S. and other countries.
 *
 *
 * DISCLAIMER OF WARRANTIES
 *
 * THE SPECIFICATION IS PROVIDED "AS IS" AND IS EXPERIMENTAL AND MAY CONTAIN DEFECTS OR DEFICIENCIES WHICH CANNOT OR WILL NOT BE CORRECTED BY JEAN-MARIE DAUTELLE, WERNER KEIL. JEAN-MARIE DAUTELLE AND WERNER KEIL MAKE NO REPRESENTATIONS OR WARRANTIES, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT THAT THE CONTENTS OF THE SPECIFICATION ARE SUITABLE FOR ANY PURPOSE OR THAT ANY PRACTICE OR IMPLEMENTATION OF SUCH CONTENTS WILL NOT INFRINGE ANY THIRD PARTY PATENTS, COPYRIGHTS, TRADE SECRETS OR OTHER RIGHTS. This document does not represent any commitment to release or implement any portion of the Specification in any product.
 *
 * THE SPECIFICATION COULD INCLUDE TECHNICAL INACCURACIES OR TYPOGRAPHICAL ERRORS. CHANGES ARE PERIODICALLY ADDED TO THE INFORMATION THEREIN; THESE CHANGES WILL BE INCORPORATED INTO NEW VERSIONS OF THE SPECIFICATION, IF ANY. JEAN-MARIE DAUTELL AND WERNER KEIL MAY MAKE IMPROVEMENTS AND/OR CHANGES TO THE PRODUCT(S) AND/OR THE PROGRAM(S) DESCRIBED IN THE SPECIFICATION AT ANY TIME. Any use of such changes in the Specification will be governed by the then-current license for the applicable version of the Specification.
 *
 *
 * LIMITATION OF LIABILITY
 *
 * TO THE EXTENT NOT PROHIBITED BY LAW, IN NO EVENT WILL JEAN-MARIE DAUTELLE, WERNER KEIL OR THEIR LICENSORS BE LIABLE FOR ANY DAMAGES, INCLUDING WITHOUT LIMITATION, LOST REVENUE, PROFITS OR DATA, OR FOR SPECIAL, INDIRECT, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF OR RELATED TO ANY FURNISHING, PRACTICING, MODIFYING OR ANY USE OF THE SPECIFICATION, EVEN IF JEAN-MARIE DAUTELLE, WERNER KEIL AND/OR ITS LICENSORS HAVE BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 * You will hold Jean-Marie Dautelle, Werner Keil (and its licensors) harmless from any claims based on your use of the Specification for any purposes other than the limited right of evaluation as described above, and from any claims that later versions or releases of any Specification furnished to you are incompatible with the Specification provided to you under this license.
 *
 *
 * RESTRICTED RIGHTS LEGEND
 *
 * If this Software is being acquired by or on behalf of the U.S. Government or by a U.S. Government prime contractor or subcontractor (at any tier), then the Government's rights in the Software and accompanying documentation shall be only as set forth in this license; this is in
 * accordance with 48 C.F.R. 227.7201 through 227.7202-4 (for Department of Defense (DoD) acquisitions) and with 48 C.F.R. 2.101 and 12.212 (for non-DoD acquisitions).
 *
 *
 * REPORT
 *
 * You may wish to report any ambiguities, inconsistencies or inaccuracies you may find in connection with your evaluation of the Specification ("Feedback"). To the extent that you provide Jean-Marie Dautelle, Werner Keil with any Feedback, you hereby: (i) agree that such Feedback is provided on a non-proprietary and non-confidential basis, and (ii) grant Jean-Marie Dautelle, Werner Keil a perpetual, non-exclusive, worldwide, fully paid-up, irrevocable license, with the right to sublicense through multiple levels of sublicensees, to incorporate, disclose, and use without limitation the Feedback for any purpose related to the Specification and future versions, implementations, and test suites thereof.
 *
 *
 * GENERAL TERMS
 *
 * Any action related to this Agreement will be governed by California law and controlling U.S. federal law. The U.N. Convention for the International Sale of Goods and the choice of law rules of any jurisdiction will not apply.
 *
 * The Specification is subject to U.S. export control laws and may be subject to export or import regulations in other countries. Licensee agrees to comply strictly with all such laws and regulations and acknowledges that it has the responsibility to obtain such licenses to export, re-export or import as may be required after delivery to Licensee.
 *
 * This Agreement is the parties' entire agreement relating to its subject matter. It supersedes all prior or contemporaneous oral or written communications, proposals, conditions, representations and warranties and prevails over any conflicting or additional terms of any quote, order, acknowledgment, or other communication between the parties relating to its subject matter during the term of this Agreement. No modification to this Agreement will be binding, unless in writing and signed by an authorized representative of each party.
 */
package javax.measure.converter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * <p> This class represents a converter of numeric values.</p>
 * 
 * <p> It is not required for sub-classes to be immutable
 *     (e.g. currency converter).</p>
 *     
 * <p> Sub-classes must ensure unicity of the {@link #IDENTITY identity} 
 *     converter. In other words, if the result of an operation is equivalent
 *     to the identity converter, then the unique {@link #IDENTITY} instance 
 *     should be returned.</p>
 *
 * @author  <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @version 1.0.1 ($Revison$), $Date: 2009-12-03 23:53:52 +0100 (Do, 03 Dez 2009) $
 */
public abstract class UnitConverter implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2557410026012911803L;
	
	/**
     * Holds the identity converter (unique). This converter does nothing
     * (<code>ONE.convert(x) == x</code>). This instance is unique.
     * (
     */
    public static final UnitConverter IDENTITY = new Identity();

    /**
     * Default constructor.
     */
    protected UnitConverter() {
    }

    /**
     * Returns the inverse of this converter. If <code>x</code> is a valid
     * value, then <code>x == inverse().convert(convert(x))</code> to within
     * the accuracy of computer arithmetic.
     *
     * @return the inverse of this converter.
     */
    public abstract UnitConverter inverse();

    /**
     * Converts a <code>double</code> value. 
     *
     * @param  value the numeric value to convert.
     * @return the <code>double</code> value after conversion.
     */
    public abstract double convert(double value);

    /**
     * Converts a {@link BigDecimal} value.
     *
     * @param value the numeric value to convert.
     * @param ctx the math context being used for conversion.
     * @return the decimal value after conversion.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is <code>MathContext.UNNECESSARY</code> or
     *         <code>mathContext.precision == 0</code> and the quotient has a
     *         non-terminating decimal expansion.
     */
    public abstract BigDecimal convert(BigDecimal value,  MathContext ctx) throws ArithmeticException;

    /**
     * Indicates whether this converter is considered to be the the same as the
     * one specified.
     *
     * @param  cvtr the converter with which to compare.
     * @return <code>true</code> if the specified object is a converter 
     *         considered equals to this converter;<code>false</code> otherwise.
     */
    @Override
    public abstract boolean equals(Object cvtr);

    /**
     * Returns a hash code value for this converter. Equals object have equal
     * hash codes.
     *
     * @return this converter hash code value.
     * @see    #equals
     */
    @Override
    public abstract int hashCode();

    /**
     * Concatenates this converter with another converter. The resulting
     * converter is equivalent to first converting by the specified converter,
     * and then converting by this converter. 
     * 
     * <p>Note: Implementations must ensure that the {@link #IDENTITY} instance
     *          is returned if the resulting converter is an identity 
     *          converter.</p> 
     * 
     * @param  converter the other converter.
     * @return the concatenation of this converter with the other converter.
     */
    public UnitConverter concatenate(UnitConverter converter) {
        return (converter == IDENTITY) ? this : new Compound(converter, this);
    }

    /**
     * This inner class represents the identity converter (singleton).
     */
    private static final class Identity extends LinearConverter {

        /**
		 * 
		 */
		private static final long serialVersionUID = 7675901502919547460L;

		@Override
        public Identity inverse() {
            return this;
        }

        @Override
        public double convert(double value) {
            return value;
        }

        @Override
        public BigDecimal convert(BigDecimal value, MathContext ctx) {
            return value;
        }

        @Override
        public UnitConverter concatenate(UnitConverter converter) {
            return converter;
        }

        @Override
        public boolean equals(Object cvtr) {
            return this == cvtr; // Unique instance.
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    /**
     * This inner class represents a compound converter (non-linear).
     */
    private static final class Compound extends UnitConverter {

        /**
		 * 
		 */
		private static final long serialVersionUID = 2242882007946934958L;
		
		/**
         * Holds the first converter.
         */
        private final UnitConverter first;
        /**
         * Holds the second converter.
         */
        private final UnitConverter second;

        /**
         * Creates a compound converter resulting from the combined
         * transformation of the specified converters.
         *
         * @param  first the first converter.
         * @param  second the second converter.
         */
        private Compound(UnitConverter first, UnitConverter second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public UnitConverter inverse() {
            return new Compound(second.inverse(), first.inverse());
        }

        @Override
        public double convert(double value) {
            return second.convert(first.convert(value));
        }

        @Override
        public BigDecimal convert(BigDecimal value, MathContext ctx) {
            return second.convert(first.convert(value, ctx), ctx);
        }

        @Override
        public boolean equals(Object cvtr) {
            if (this == cvtr)
                return true;
            if (!(cvtr instanceof Compound)) 
                return false;            
            Compound that = (Compound) cvtr;
            return (this.first.equals(that.first)) &&
                    (this.second.equals(that.second));
        }

        @Override
        public int hashCode() {
            return first.hashCode() + second.hashCode();
        }
    }
}