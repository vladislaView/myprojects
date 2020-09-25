using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Test1Code;

namespace Test1Project
{
    /*
     * You should complete the follow tests.
     * 1.Test the Login method and write the testing report.
     * 2.Test the Add method and write the testing report.
     * 3.Test the Minus method and write the testing report.
     * 4.Test the Divide method and write the testing report.
     * 5.Test the Multiply method and write the testing report.
     */

    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void LoginMethod()
        {
            bool a = AppClass.Login("test1", "test2");
            Assert.IsFalse(a);
            Assert.IsTrue(AppClass.Login("admin", "123456"));
        }

        [TestMethod]
        public void AddMethod()
        {
            Assert.AreEqual(1, AppClass.Add(1, 0));
            Assert.AreNotEqual(15, AppClass.Add(10, 20));
        }

        [TestMethod]
        public void MinusMethod()
        {
            Assert.AreEqual(-1, AppClass.Minus(0, 1));
            Assert.AreNotEqual(20, AppClass.Minus(20, 20));
        }
        [TestMethod]
        public void DivideMethod()
        {
            Assert.AreEqual(2, AppClass.Divide(10, 5));
            Assert.AreNotEqual(2, AppClass.Divide(2, 5));
        }
        [TestMethod]
        public void MultiplyMethod()
        {
            Assert.AreNotEqual(25, AppClass.Multiply(20, 25));
            Assert.AreEqual(15, AppClass.Multiply(5, 3));
        }
    }
}
