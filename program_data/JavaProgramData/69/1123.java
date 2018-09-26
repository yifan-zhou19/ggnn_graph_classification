package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[250]);
	public static String b = new String(new char[250]);
	public static String sum = new String(new char[251]);
	public static int Main()
	{
		int lena; //l????????
		int lenb;
		int i;
		int l;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		lena = a.length(); //????a???
		lenb = b.length(); //????b???
		if (lena > lenb)
		{
			l = lena;
		}
		else
		{
			l = lenb;
		}
		for (i = 0;i < l;i++)
		{
			a.charAt(i) -= '0',b.charAt(i) -= '0'; //?????ASCII?????,???????????
		}
		if (lena > lenb)
		{
				for (i = lena - 1;i >= lena - lenb;i--) //??i?lena-lenb???lena-1?????
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - lena + lenb));
				}
				for (i = 0;i < lena - lenb;i++)
				{
					b = b.substring(0, i);
				}
		}
		else if (lena < lenb)
		{
				for (i = lenb - 1;i >= lenb - lena;i--)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - lenb + lena));
				}
				for (i = 0;i < lenb - lena;i++)
				{
					a = a.substring(0, i);
				}
		} //?????????????????????
		f = l;
		for (i = 0;i < l;i++)
		{
			sum = tangible.StringFunctions.changeCharacter(sum, i + 1, a.charAt(i) + b.charAt(i)); //?????,????  i+1?????????????????????
		}
		for (i = l;i >= 0;i--)
		{
			if (sum.charAt(i) > 9)
			{
				sum.charAt(i) -= 10,sum.charAt(i - 1)++; //??
			}
		}
		for (i = l;i >= 0;i--)
		{
			if (sum.charAt(i) != 0)
			{
				f = i;
			}
		}
		for (i = f;i <= l;i++)
		{
			System.out.printf("%d",sum.charAt(i));
		}
	}
}

