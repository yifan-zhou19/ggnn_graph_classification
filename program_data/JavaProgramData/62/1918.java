package <missing>;

public class GlobalMembers
{
	//***********************************************
	//???????
	//??????
	//???2012.12.2
	//***********************************************


	public static int Main()
	{
		String sentence = new String(new char[50]); //????????
		char a;
		int i = 0; //??????????????
		String p = null;
		while ((a = System.in.read()) != '\n') //????
		{
			sentence = tangible.StringFunctions.changeCharacter(sentence, i, a);
			i++;
		}
		p = sentence; //???p?????????
		while (p < sentence.Substring(i))
		{
			if (p != ' ')
			{
				System.out.print(p);
				p = p.Substring(1); //?????????????
			}
			else
			{
				System.out.print(p);
				while (p == ' ')
				{
					p = p.Substring(1); //???????????
				}
			}
		}
		System.out.print("\n");
	return 0;
	}
}

