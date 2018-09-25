package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int z;
	  int i;
	  int j;
	  int n;
	  int t;
	  int count;
	  int time;
	  int tem;
	  int pre;
	  int go;
	  char dd = '0';
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (z = 0;z < t;z++)
	  {
		for (;;)
		{
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   dd = tempVar2.charAt(0);
	   }
	   if (dd == '\n')
	   {
		   break;
	   }
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			go = Integer.parseInt(tempVar3);
		}
		}
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  n = Integer.parseInt(tempVar4);
	  }
	  if (n == 0)
	  {
		  System.out.print("60\n");
		  continue;
	  }
	  count = 0;
	  time = 0;
	  tem = 0;
	  pre = 0;
	  for (i = 0;i < n;i++)
	  {
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  tem = Integer.parseInt(tempVar5);
	  }
	  pre = time;
	  time = tem + 3 * (i + 1);
	  if (time < 60)
	  {
		  count = tem;
	  }
	 else
	 {
	  if (time >= 63)
	  {
		  count = count + 60 - pre;
		  break;
	  }
	  else
	  {
	   count = tem;
	  break;
	  }
	 }
	  }
	if (time <= 60)
	{
		count = count + 60 - time;
	}
	System.out.printf("%d\n",count);
	  }
	}
}

