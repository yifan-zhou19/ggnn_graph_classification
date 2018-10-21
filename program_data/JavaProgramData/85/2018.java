package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] zf = new char[100][21];
	int n;
	int i;
	int j;
	int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zf[i] = tempVar2.charAt(0);
	}
	}

	for (j = 0;j < n;j++)
	{
		int flag = 0;
	   for (i = 0;zf[j][i] != '\0';i++)
	   {
			if (!((zf[j][i] == '_') || (zf[j][i] >= 'A' && zf[j][i] <= 'Z') || (zf[j][i] >= 'a' && zf[j][i] <= 'z') || (zf[j][i] >= '0' && zf[j][i] <= '9' && i>0)))
			{
					System.out.print("no\n");
					flag = 1;
					break;
			}
	   }
	   if (flag == 0)
	   {
		   System.out.print("yes\n");
	   }
	}

	   return 0;
	}




}

