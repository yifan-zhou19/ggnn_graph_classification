package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int flag;
		int l = 0;
		String st = new String(new char[100]);
		String st1 = new String(new char[100]);
		String st2 = new String(new char[100]);
		st = new Scanner(System.in).nextLine();
		for (i = 0;st.charAt(i) != ' ';i++)
		{
			st1 = tangible.StringFunctions.changeCharacter(st1, i, st.charAt(i));
			l++;
		}
		i++;
		for (j = 0;st.charAt(i) != '\0';j++,i++)
		{
			st2 = tangible.StringFunctions.changeCharacter(st2, j, st.charAt(i));
		}
		for (i = 0;;i++)
		{
			if (st2.charAt(i) == st1.charAt(0))
			{
				flag = 1;
				for (j = 0;j < l;j++)
				{
					if (st2.charAt(i + j) != st1.charAt(j))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}
	}
}

