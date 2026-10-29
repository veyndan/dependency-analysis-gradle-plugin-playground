package energy.octopus.octopusenergy.campaign

@DslMarker
annotation class CampaignDSL

fun campaign(campaignBuilder: AccountCampaignBuilder.() -> Unit): AccountCampaign = AccountCampaignBuilder().apply(campaignBuilder).build()

@CampaignDSL
class AccountCampaignBuilder internal constructor() {
    var name = ""
    var slug = ""

    fun build() = AccountCampaign(
        name = name,
        slug = slug,
    )
}
