package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t;
	int i;
	int n;
	int j;
	int p;
	int y;
	String a = new String(new char[1000]);
	char s;
	int[] b = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = Integer.parseInt(tempVar);
	}
	for (y = 0;y < p;y++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,0,1000 * (Character.SIZE / Byte.SIZE));

		   t = 0;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = tempVar2.charAt(0);
		   }
		   n = a.length();
		   for (i = 0;i < n;i++)
		   {
		   b[i] = 0;
		   }
		   for (i = 0;i < n;i++)
		   {
						   for (j = 0;j < n;j++)
						   {
										   if (a.charAt(i) == a.charAt(j))
										   {
										   b[j] = b[j] + 1;
										   }
						   }
		   }

		   for (i = 0;i < n;i++)
		   {
						   if (b[i] == 1)
						   {
										  System.out.printf("%c\n",a.charAt(i));
									  t = 1;
									  break;
						   }
		   }

		   if (t == 0)
		   {
		   System.out.print("no\n");
		   }
	}
	}



}

