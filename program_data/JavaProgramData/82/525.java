package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] shou = new int[100];
	int[] shu = new int[100];
	int time;
	int m = 0;
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		shou[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		shu[0] = Integer.parseInt(tempVar3);
	}
	if ((shou[0] >= 90) && (shou[0] <= 140) && (shu[0] >= 60) && (shu[0] <= 90))
	{
	  m = 1;
	  t = 1;
	}
	for (i = 1;i < n;i++)
	{
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 shou[i] = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 shu[i] = Integer.parseInt(tempVar5);
	 }
	 if ((shou[i] >= 90) && (shou[i] <= 140) && (shu[i] >= 60) && (shu[i] <= 90))
	 {
	   time = 1;
	 }
	  else
	  {
	  time = 0;
	  }
	 if ((shou[i - 1] >= 90) && (shou[i - 1] <= 140) && (shu[i - 1] >= 60) && (shu[i - 1] <= 90))
	 {
		if (time == 1)
		{
		m = m + 1;
		 if (m > t)
		 {
		 t = m;
		 }
		}
		else
		{
		 m = 0;
		}
	 }
	  if ((time == 1) && ((shou[i - 1] < 90) || (shou[i - 1]>140) || (shu[i - 1] < 60) || (shu[i - 1]>90)))
	  {
	  m = 1;
	  }
	}
	  System.out.printf("%d",t);
	  return 0;
	}

}

