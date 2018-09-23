package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] vol = new int[3];
		int[] judge = new int[3];
		int i;
		int j;
		int k;
		int ri;
		int rj;
	  for (i = 0;i < 3;i++)
	  {
		  for (j = 0;j < 3;j++)
		  {
			  for (k = 0;k < 3;k++)
			  {
				  vol[0] = i;
				  vol[1] = j;
				  vol[2] = k;
				  judge[0] = (vol[0] < vol[1]) + (vol[2] == vol[0]);
				  judge[1] = (vol[0] > vol[1]) + (vol[0] > vol[2]);
				  judge[2] = (vol[2] > vol[1]) + (vol[1] > vol[0]);

				  for (ri = 0;ri < 3;ri++)
				  {
					  for (rj = 0;rj < 3;rj++)
					  {
						  if ((vol[ri] >= vol[rj]) && (judge[ri] > judge[rj]))
						  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							  goto end1;
						  }
					  }
				  }

				  for (ri = 2;ri >= 0;ri--)
				  {
					  for (rj = 0;rj < 3;rj++)
					  {
						  if (vol[rj] == ri)
						  {
							  System.out.print((char)(rj + 65));
						  }
					  }

				  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  goto endall;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  end1:
				  ;
			  }
		  }
	  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	  endall:
	  ;

	  System.in.read();
	  System.in.read();
	  System.in.read();

		return 0;
	}
}
