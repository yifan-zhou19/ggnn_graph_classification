package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		char m;
		int[] weight = new int[4];
		final String name = "zqsl";
		for (weight[0] = 1; weight[0] <= 5 ;weight[0]++)
		{
			for (weight[1] = 1; weight[1] <= 5 ;weight[1]++)
			{
				for (weight[2] = 1; weight[2] <= 5 ;weight[2]++)
				{
					for (weight[3] = 1; weight[3] <= 5 ;weight[3]++)
					{
						if ((weight[3] != weight[1]) && (weight[3] != weight[0]) && (weight[3] != weight[2]) && (weight[1] != weight[0]) && (weight[2] != weight[1]) && (weight[2] != weight[0]))
						{
								 if ((weight[0] + weight[1]) == (weight[2] + weight[3]))
								 {
									if ((weight[0] + weight[3]) > (weight[2] + weight[1]))
									{
									   if ((weight[0] + weight[2]) < weight[1])
									   {
										  for (i = 0; i < 3; i++)
										  {
											  for (j = i + 1; j < 4; j++)
											  {
												  if (weight[i] < weight[j])
												  {
													   t = weight[i];
													   weight[i] = weight[j];
													   weight[j] = t;
													   m = name.charAt(i);
													   name = tangible.StringFunctions.changeCharacter(name, i, name.charAt(j));
													   name = tangible.StringFunctions.changeCharacter(name, j, m);
												  }
											  }
										  }
										  for (i = 0; i < 4; i++)
										  {
											  System.out.print(name.charAt(i));
											  System.out.print(" ");
											  System.out.print(weight[i] * 10);
											  System.out.print("\n");
										  }
									   }
									}
								 }
						}
					}
				}
			}
		}
		return 0;
	}
}

