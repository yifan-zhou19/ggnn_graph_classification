package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int tem;
	int a;
	int b;
	int count = 0;
	int tr = 0;
	int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  tem = Integer.parseInt(tempVar2);
	  }
	  if (tem == 255 && tr == 1)
	  {
		  tr = 2;
	  }
	  else if (tem == 0 && tr == 0)
	  {
		  s++;
		  tr = 1;
	  }
	  else if (tem == 0 && tr == 1)
	  {
		  s++;
	  }
	  if (tem == 0)
	  {
		  count++;
	  }
	  }
	if (tr == 1)
	{
		tr = 2;
	}
	}
	System.out.printf("%d",((count - 2 * s) / 2) * (s - 2));
	}
}

