package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		char temp;
		int i;
		int j;
		int l;
		int t = 0;
		int k;
		int flag = 1;
		int jmin;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			jmin = i;
			for (j = i + 1;j < l;j++)
			{
				if (a.charAt(j) < a.charAt(jmin))
				{
					jmin = j;
				}
			}
			temp = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(jmin));
			a = tangible.StringFunctions.changeCharacter(a, jmin, temp);
		}
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
			flag = 1;
			t = 0;
			for (j = 0;j < l;j++) //?????????
			{
				if (a.charAt(i) == a.charAt(j))
				{
					t++;
				}
			}
			for (k = i - 1;k >= 0;k--) //?????????
			{
				if (a.charAt(i) == a.charAt(k))
				{
					flag = 0;
				}
			}
			if (flag == 1)
			{
				System.out.printf("%c=%d\n",a.charAt(i),t);
			}
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
	}

}

