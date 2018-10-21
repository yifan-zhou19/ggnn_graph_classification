package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}

		{
		//?????????
		int i = 0;
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
			}
			i++;
		}
}
		//samechar??????samecount?????
		String samechar = new String(new char[1000]);
		int[] samecount = new int[1000];
		char tmp;
		tmp = str.charAt(0);
		//jishu?samechar?????
		int jishu = 0;
		int i1;
		for (i1 = 0;str.charAt(i1) != '\0';i1++)
		{
			if (tmp == str.charAt(i1))
			{
				samechar = tangible.StringFunctions.changeCharacter(samechar, jishu, tmp);
				samecount[jishu]++;
			}
			else
			{
				tmp = str.charAt(i1);
				jishu++;
				samechar = tangible.StringFunctions.changeCharacter(samechar, jishu, tmp);
				samecount[jishu]++;
			}
		}
		//????
		int i2;
		for (i2 = 0;i2 <= jishu;i2++)
		{
			System.out.printf("(%c,%d)",samechar.charAt(i2),samecount[i2]);
		}
		return 0;
	}

}

