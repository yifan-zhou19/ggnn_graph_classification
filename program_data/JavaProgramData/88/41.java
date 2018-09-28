package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int o = 0;
		int k = 0;
		int p = 0;
		String a = new String(new char[100]);
		char[][] b =
		{
			{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] c =
		{
			{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				b[o][k++] = a.charAt(i);
			}
			if (!(a.charAt(i) >= '0' && a.charAt(i) <= '9'))
			{
				o++;
				k = 0;
			}
		}
		for (i = 0;i <= o;i++)
		{
			if (strcmp(b[i]," ") != -1)
			{
				System.out.printf("%s\n",b[i]);
			}
			//printf("%d\n",strcmp(b[i]," "));
		}






		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		return 0;
	}

}

