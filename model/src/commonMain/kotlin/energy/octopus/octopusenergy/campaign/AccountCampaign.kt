package energy.octopus.octopusenergy.campaign

import energy.octopus.octopusenergy.account.model.AccountNumber
import kotlinx.datetime.LocalDate

data class AccountCampaign(
    val accountNumber: AccountNumber,
    val name: String,
    val slug: String,
    val expires: LocalDate?,
)
