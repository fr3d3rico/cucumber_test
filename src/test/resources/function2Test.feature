Feature: Feature to test function 2
	Scenario: Try Access Guia Inicial Pública and not input comarca, area de distribuicao e classe
		Given Access home page
			When Click on Guia Inicial Publica
				And Choose Natureza "Despejo"
				And Input "name" in input name
				And Click on previa button
				Then blabla