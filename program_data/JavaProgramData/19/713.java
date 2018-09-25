package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int lena;
		int posi;
		int i;
		int j;
		char[][] a = new char[101][100];
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		char index = 0;
		String e = new String(new char[200]);
		e = new Scanner(System.in).nextLine();
	i = 0;
	for (j = 0;j < e.length();j++)
	{
	if (e.charAt(j) == ' ')
	{
	index++;
	i = 0;
	}
	else
	{
	a[index][i++] = e.charAt(j);
	}

	}
	index++;
	//printf("%d!\n",index);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		for (i = 0;i < index;i++)
		{
		   if (strcmp(a[i],b) == 0)
		   {
			   System.out.printf("%s",c);
		   }
		   else
		   {
			   System.out.printf("%s",a[i]);
		   }
	if (i != index - 1)
	{
		System.out.print(" ");
	}
		}
		return 0;
	}

}

