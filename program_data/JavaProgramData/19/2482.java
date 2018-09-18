package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n = 0;
		char[][] str = new char[100][100];
		String x = new String(new char[100]);
		String y = new String(new char[100]);
		char temp1;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str[i] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			temp1 = tempVar2.charAt(0);
		}
		i++;
		n++;
		}while (temp1 != '\n');
		x = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			if (strcmp(str[i],x) == 0)
			{
				str[i] = y;
			}
			//printf("%s",str[i]);
		}
		//printf("%s\n%s\n%s\n",x,y,temp2);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s%c",str[i],(i == n - 1?'\n':' '));
		}
	}
}

