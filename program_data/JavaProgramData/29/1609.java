package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m; //i,j??????
	  int n;
	  int i;
	  int j;
	  float[] up = new float[100]; //??????????????
	  float[] down = new float[100];
	  float sum; //???
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  up[1] = 2F;
	  up[2] = 3F;
	  down[1] = 1F;
	  down[2] = 2F; //????
	  for (i = 1;i <= m;i++)
	  {
		sum = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			sum = sum + (up[1] / down[1]);
		}
		if (n == 2)
		{
			sum = sum + (up[1] / down[1]) + (up[2] / down[2]); //???????????
		}
		if (n >= 3)
		{
			 sum = sum + (up[1] / down[1]) + (up[2] / down[2]);
			 for (j = 3;j <= n;j++)
			 {
				  up[j] = up[j - 1] + up[j - 2];
				  down[j] = down[j - 1] + down[j - 2]; //??????J??
				  sum = sum + (up[j] / down[j]); //???
			 }
		}
		 System.out.printf("%.3f",sum);
		 System.out.print("\n");
	  }

	  return 0;
	}
}

