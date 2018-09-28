package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] bb = new int[5];
		 int g;
		 int h;
		 int i;
		 int[] aa = new int[6];
	  for (bb[0] = 1;bb[0] <= 5;bb[0]++)
	  {
		  for (bb[1] = 1;bb[1] <= 5;bb[1]++)
		  {
		  if (bb[1] == bb[0])
		  {
			continue;
		  }
			 for (bb[2] = 1;bb[2] <= 5;bb[2]++)
			 {
			if (bb[2] == bb[1] || bb[2] == bb[0])
			{
			   continue;
			}
			   for (bb[3] = 1;bb[3] <= 5;bb[3]++)
			   {
					   if (bb[3] == bb[0] || bb[3] == bb[1] || bb[3] == bb[2])
					   {
						 continue;
					   }
					 g = 0;
					   h = 0;
				  bb[4] = 15 - bb[0] - bb[1] - bb[2] - bb[3];
			 if (bb[4] == 2 || bb[4] == 3)
			 {
			continue;
			 }
				aa[0] = (bb[4] == 1);
				aa[1] = (bb[1] == 2);
				aa[2] = (bb[0] == 5);
				aa[3] = (bb[2] != 1);
				aa[4] = (bb[3] == 1);

			  if (aa[0] + aa[1] + aa[2] + aa[3] + aa[4] == 2)
			  {

				 for (i = 0;i <= 4;i++)
				 {
				   if ((bb[i] == 1) && (aa[i] == 1))
				   {
					  g = 1;
				   }
				 }
				  for (i = 0;i <= 4;i++)
				  {
				   if ((bb[i] == 2) && (aa[i] == 1))
				   {
					  h = 1;
				   }
				  }
			  }

					 if (g == 1 && h == 1)
					 {
			 System.out.print(bb[0]);
			 System.out.print(" ");
			 System.out.print(bb[1]);
			 System.out.print(" ");
			 System.out.print(bb[2]);
			 System.out.print(" ");
			 System.out.print(bb[3]);
			 System.out.print(" ");
			 System.out.print(bb[4]);
			 System.out.print("\n");
					 }
			   }
			 }
		  }
	  }
	return 0;
	}
}
