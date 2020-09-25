using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Test2Code;

namespace Test2Project
{
    /*
     * You should finish the follow tests.
     * 1.Test the IsLeapYear method in the Validation class.
     * 2.Test the LastDayOfMonth method in the Validation class.
     * 3.Test the ValidDate method in the Validation class.
     * 4.Test the IncrementDate method in the Validation class.
     */

    [TestClass]
    public class UnitTest2
    {
        [TestMethod]
        public void IsLeapYearMethod()
        {
            Assert.AreEqual(false, Validation.IsLeapYear(2017));
            Assert.AreEqual(false, Validation.IsLeapYear(2016));
        }

        [TestMethod]
        public void LastDayOfMonth()
        {
            Assert.AreEqual(31, Validation.LastDayOfMonth(2017, 12));
        }

        [TestMethod]
        public void ValidDateMethod()
        {
            Assert.AreEqual(true, Validation.ValidDate(new Day() { Year = 2016, Month = 12, Date = 31}));
        }

        [TestMethod]
        public void IncrementDate()
        {
            Assert.AreNotEqual(DateTime.Now, Validation.IncrementDate(new Day() { Date = DateTime.Now.Day, Month = DateTime.Now.Month, Year = DateTime.Now.Year }));
        }
    }
}
