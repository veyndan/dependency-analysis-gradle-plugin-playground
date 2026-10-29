package energy.octopus.octopusenergy.campaign

import energy.octopus.octopusenergy.account.model.AccountNumber

@DslMarker
annotation class CampaignDSL

fun campaign(campaignBuilder: AccountCampaignBuilder.() -> Unit): AccountCampaign = AccountCampaignBuilder().apply(campaignBuilder).build()

@CampaignDSL
class AccountCampaignBuilder internal constructor() {
    var accountNumber = AccountNumber("A-12345678")
    var name = ""
    var slug = ""

    fun build() = AccountCampaign(
        accountNumber = accountNumber,
        name = name,
        slug = slug,
    )
}
