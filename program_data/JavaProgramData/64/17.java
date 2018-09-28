package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] location = new int[11][3];
		int[] p = new int[3];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 0; j < 3; j++)
			{
				location[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct team
	//	{
	//		   int a1;
	//		   int a2;
	//		   double distance;
	//	}
	//	zu[45], t;
		int k = 0;
		p = location;
		for (i = 1; i < n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				zu[k].a1 = i;
				zu[k].a2 = j;
				int x;
				int y;
				int z;
				x = location[i][0] - location[j][0];
				y = location[i][1] - location[j][1];
				z = location[i][2] - location[j][2];
				zu[k].distance = Math.sqrt(x * x + y * y + z * z);
				k++;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = i + 1; j < k; j++)
			{
				if (zu[i].distance - zu[j].distance < -0.01)
				{
					 t = zu[i];
					 zu[i] = zu[j];
					 zu[j] = t;
				}
				else if (Math.abs(zu[i].distance - zu[j].distance) < 0.01)
				{
						  if (zu[i].a1 > zu[j].a1)
						  {
							   t = zu[i];
							   zu[i] = zu[j];
							   zu[j] = t;
						  }
						  else if (zu[i].a1 == zu[j].a1)
						  {
									if (zu[i].a2 > zu[j].a2)
									{
										 t = zu[i];
										 zu[i] = zu[j];
										 zu[j] = t;
									}
						  }
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print("(");
			System.out.print(location[zu[i].a1][0]);
			System.out.print(",");
			System.out.print(location[zu[i].a1][1]);
			System.out.print(",");
			System.out.print(location[zu[i].a1][2]);
			System.out.print(")-(");
			System.out.print(location[zu[i].a2][0]);
			System.out.print(",");
			System.out.print(location[zu[i].a2][1]);
			System.out.print(",");
			System.out.print(location[zu[i].a2][2]);
			System.out.print(")=");
			System.out.printf("%.2f", zu[i].distance);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

