import org.junit.Test
import org.junit.Assert.*
import ru.netology.*

class Task03_2KtTest{

    @Test
    fun test_pay_Visa_Sum100_amount_400() {
        // arrange
        val amount = 400_00
        val sum = 100_00
        val type = VISA
        val expectedValue = "С суммы 400 руб. 00 коп., будет взята комиссия 35 руб. 00 коп."
        //act
        val actualValue = pay(amount,sum,type)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_calcCommission_100_sum0_Visa() {
        // arrange
        val amount = 100_00
        val sum = 0
        val type = VISA
        val expectedValue = 35_00
        //act
        val actualValue = calcCommission(amount,sum,type)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_calcCommission_100_sum0_MC() {
        // arrange
        val amount = 100_00
        val sum = 35_00
        val type = MASTER_CARD
        val expectedValue = 0
        //act
        val actualValue = calcCommission(amount,sum,type)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_calcCommission_100_sum0_VKPay() {
        // arrange
        val amount = 100_00
        val sum = 0
        val type = VK_PAY
        val expectedValue = 0
        //act
        val actualValue = calcCommission(amount,sum,type)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_commission_ByMasterCardAndMaestro_byAmount_100_andSum_75000() {
        // arrange
        val amount = 100_00
        val sum = 75_000_00
        val expectedValue = 80
        //act
        val actualValue = commissionByMasterCardAndMaestro(amount,sum)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_commission_ByMasterCardAndMaestro_byAmount_100_andSum_0() {
        // arrange
        val amount = 100_00
        val expectedValue = 0
        //act
        val actualValue = commissionByMasterCardAndMaestro(amount)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_commission_ByMasterCardAndMaestro_byAmount_75000() {
        // arrange
        val amount = 75_000_00
        val expectedValue = 450_20
        //act
        val actualValue = commissionByMasterCardAndMaestro(amount)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_commission_ByVisaAndMir_byAmount_100() {
        // arrange
        val amount = 100_00
        val expectedValue = 35_00
        //act
        val actualValue = commissionByVisaAndMir(amount)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_commission_ByVisaAndMir_byAmount_5000() {
        // arrange
        val amount = 5_000_00
        val expectedValue = 37_50
        //act
        val actualValue = commissionByVisaAndMir(amount)
        //assert
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun test_intKop_To_StringRubAndKop() {
        // arrange
        val kop = 100_10
        val expectedValue = "100 руб. 10 коп."
        //act
        val actuialValue = intKopToRubAndKop(kop)
        //assert
        assertEquals(expectedValue,actuialValue)
    }
}