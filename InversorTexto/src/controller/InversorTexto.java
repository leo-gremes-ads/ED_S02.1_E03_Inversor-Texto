package controller;

public class InversorTexto
{
	public InversorTexto()
	{
		super();
	}

	/*
	PONTO DE PARADA -> Um texto de apenas um caractere é igual a sua própria
		inversão.

	EM FUNÇÃO DO TERMO ANTERIOR -> Uma cadeia de texto invertida equivale a
		colocar o último caractere na frente e replicar a função para o texto
		sem o último caractere.
	*/
	
	public String inverteTexto(String txt)
	{
		int len = txt.length();

		if (len == 0) // -> Caso o input seja vazio
			return "";
		if (len == 1)
			return txt;
		return txt.charAt(len - 1) + inverteTexto(txt.substring(0, len - 1));
	}
}