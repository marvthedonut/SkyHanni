package at.hannibal2.skyhanni.config.features.inventory;

import at.hannibal2.skyhanni.config.FeatureToggle;
import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import org.lwjgl.input.Keyboard;

public class AuctionHouseConfig {


    @Expose
    @ConfigOption(
        name = "Highlight Auctions",
        desc = "Highlight own items that are sold in green and that are expired in red."
    )
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean highlightAuctions = true;

    @Expose
    @ConfigOption(
        name = "Highlight Underbid Auctions",
        desc = "Highlight underbid own lowest BIN auctions that are outbid."
    )
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean highlightAuctionsUnderbid = false;

    @Expose
    @ConfigOption(
        name = "Auto Copy Underbid",
        desc = "Automatically copies the price of an item in the \"Create BIN Auction\" minus 1 coin into the clipboard for faster under-bidding."
    )
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean autoCopyUnderbidPrice = false;

    @Expose
    @ConfigOption(
        name = "Copy Underbid Keybind",
        desc = "Copies the price of the hovered item in Auction House minus 1 coin into the clipboard for easier under-bidding."
    )
    @ConfigEditorKeybind(defaultKey = Keyboard.KEY_NONE)
    public int copyUnderbidKeybind = Keyboard.KEY_NONE;
}
