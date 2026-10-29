package energy.octopus.octopusenergy.campaign

import energy.octopus.octopusenergy.account.model.AccountNumber
import kotlinx.datetime.LocalDate

@DslMarker
annotation class CampaignDSL

fun campaign(campaignBuilder: AccountCampaignBuilder.() -> Unit): AccountCampaign = AccountCampaignBuilder().apply(campaignBuilder).build()

@CampaignDSL
class AccountCampaignBuilder internal constructor() {
    var accountNumber = AccountNumber("A-12345678")
    var name = ""
    var slug = ""
    var expires: LocalDate? = null

    fun build() = AccountCampaign(
        accountNumber = accountNumber,
        name = name,
        slug = slug,
        expires = expires,
    )
}
