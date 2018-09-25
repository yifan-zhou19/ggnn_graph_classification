package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int i;
		int j = 0;
		int k = 0;
		String s = new String(new char[100]);
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String[] str = {" "};
		(char)(*p)[20];
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) != ' ')
			{
				str[j][k++] = s.charAt(i);
			}
			else
			{
				j++;
				k = 0;
			}
			if (s.charAt(i + 1) == '\0')
			{
				j++;
			}
		}
		p = str[0];
		for (i = 0;i < j;i++)
		{
			if (strcmp(a,*(p + i)) == 0)
			{
				*(p + i) = b;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (i == 0)
			{
				System.out.printf("%s",*(p + i));
			}
			else
			{
				System.out.printf(" %s",*(p + i));
			}
		}

	}






}

