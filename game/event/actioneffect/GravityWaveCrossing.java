package com.loxon.javachallenge.challenge.game.event.actioneffect;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.loxon.javachallenge.challenge.game.model.GravityWaveCause;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Egy GravityWave adatait leíró osztály.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GravityWaveCrossing extends ActionEffect {

	/**
	 * A GravityWave-et kiváltó ok.
	 * @see GravityWaveCause
	 */
	@JsonProperty("c") private GravityWaveCause cause;

	/**
	 * A GravityWave-et kiváltó objektum forrásának azonosítója.
	 */
	@JsonProperty("sId") private int sourceId;

	/**
	 * MBH esetén az MBH-t indító bolygó irányszöge valamekkora bizonytalansággal.
	 * Űrmisszió esetén az űrmisszió érkezési bolygójának irányszöge valamekkora bizonytalansággal.
	 * Féreglyuk elkészülés esetén az építő játékos féreglyukhoz legközelebb álló bolygójának az irányszöge valamekkora bizonytalansággal.
	 * Passzivitás esetén a passzív játékos egy véletlenszerűen kiválasztott bolygójának az irányszöge valamekkora bizonytalansággal.
	 * 
	 */
	@JsonProperty("dir") private double direction;
}
