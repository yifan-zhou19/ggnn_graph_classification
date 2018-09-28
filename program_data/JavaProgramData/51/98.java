package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zfc = new String(new char[520]);
	char[][] chu = new char[520][5];
	int[] ps = new int[520];
	int n;
	int m;
	int[] max = new int[520];
	int s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(zfc,'\0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(chu,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(ps,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(max,0,(Integer.SIZE / Byte.SIZE));
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zfc = tempVar2.charAt(0);
	}
	for (int i = 0;i <= zfc.length() + 1 - n;i++)
	{
		  m = 0;
		  for (int j = i;j < i + n;j++)
		  {
			   chu[i][m] = zfc.charAt(j);
			   m++;
		  }
	}
	ps[0] = 1;
	for (int t = 1;t <= zfc.length() + 1 - n;t++)
	{
		ps[t] = 1;
		for (int k = 0;k < t;k++)
		{
		  if (ps[k] == 0)
		  {
			  continue;
		  }
		  if (strcmp(chu[k],chu[t]) == 0)
		  {
				   ps[k]++;
				   ps[t] = 0;
				   break;
		  }
		}
	}
	s = 1;
	for (int a = 1;a <= zfc.length() + 1 - n;a++)
	{
		 if (ps[a] > ps[max[0]])
		 {
			  max[0] = a;
				  for (int y = 1;y <= s;y++)
				  {
					  max[y] = 0;
				  }
			  s = 1;
			  continue;
		 }
		 if (ps[a] == ps[max[0]])
		 {
			  s++;
			  max[s - 1] = a;
		 }
	}
	if (ps[max[0]] <= 1)
	{
		  System.out.print("NO");
	}
	else
	{
		  System.out.printf("%d\n",ps[max[0]]);
		  for (int c = 0;c < s;c++)
		  {
			  System.out.printf("%s\n",chu[max[c]]);
		  }
	}
	return 0;
	}
}

