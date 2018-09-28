package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int len;
	int i;
	int P = 0;
	int panel = 0;
	String a = new String(new char[100]);
	int[] b = new int[100];
	int[] p = new int[100];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	len = a.length();

	for (i = 0;i <= len - 1;i++)
	{
					   b[i] = a.charAt(i) - '0';
					   //printf("%d",b[i]);
	}
	for (i = 0;i <= len - 1;i++)
	{
					   panel = 10 * panel + b[i];
					   p[i] = panel / 13;
					   if (p[i] != 0)
					   {
					   P = 1;
					   }
					   panel = panel - p[i] * 13;
					   if (P == 0)
					   {
								  continue;
					   }
					   else
					   {
						   System.out.printf("%d",p[i]);
					   }
	}
	if (P == 0)
	{
	System.out.print("0");
	}
	System.out.printf("\n%d",panel);

	}

}

