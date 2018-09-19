package <missing>;

public class GlobalMembers
{
	public static int[] stat = new int[115];
	public static int i;
	public static int n;
	public static int k;
	public static int first = 0;
	public static int Main()
	{
	  for (i = 0;i < 110;i++)
	  {
		  stat[i] = 0;
	  }
	  for (scanf("%d",n),i = 0;i < n;i++)
	  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 printf(stat[k] == 1?"%s%d":"",i != 0?" ":"",k);

	  }
	  System.out.print("\n");
	  return 0;
	}
}

