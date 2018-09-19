package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[100][100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		int k;

		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[i] = tempVar.charAt(0);
		}
		i++;
		} while (System.in.read() != '\n');

		k = i;

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}

		for (i = 0;i < k - 1;i++)
		{
			if (strcmp(s[i],a) == 0)
			{
				System.out.printf("%s ",b);
			}
			else
			{
				System.out.printf("%s ",s[i]);
			}
		}
		if (strcmp(s[i],a) == 0)
		{
			System.out.printf("%s",b);
		}
		else
		{
			System.out.printf("%s",s[i]);
		}

	}



}

