package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int breaktimes;
	 int[] num = new int[100];
	 int time;
	 int count;
	 int mark;
	 int temptime;
	 for (int ii = 0;ii < n;ii++)
	 {
	  int i;
	  int j;
	  time = 60;
	  count = 0;
	  mark = -1;
	  breaktimes = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (breaktimes == 0)
	  {
		  System.out.print(time);
		  System.out.print("\n");
		  continue;
	  }
	  for (i = 0;i < breaktimes;i++)
	  {
		  num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (j = 0;j < breaktimes;j++)
	  {
	   time = 60;
	   time = time - num[j] - (j + 1) * 3;
	   if (time < -3)
	   {
		   break;
	   }
		else
		{
			mark++;
		}
	  }
	  if (mark == -1)
	  {
		  System.out.print("60");
		  System.out.print("\n");
		  continue;
	  }
	  if (mark < breaktimes)
	  {
		   temptime = 60 - num[mark] - (mark + 1) * 3;
		if (temptime > 0)
		{
		 count = num[mark] + temptime;
		}
		 else
		 {
			 count = num[mark];
		 }
	  }
	  System.out.print(count);
	  System.out.print("\n");
	 }
	  return 0;
	}
}

