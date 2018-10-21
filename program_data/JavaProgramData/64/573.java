public class _DISTANCE
{
	public float distance;
	public int[] pointa = new int[3];
	public int[] pointb = new int[3];
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int b;
		int m;
		int[][] point = new int[10][3];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			  for (j = 0;j < 3;j++)
			  {
					 point[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
		}

		_DISTANCE[] test = tangible.Arrays.initializeWithDefault_DISTANCEInstances(n * (n - 1) / 2);

		for (i = 0; i < n; ++i)
		{
			for (j = i + 1;j < n;j++)
			{
			  float distance = Math.sqrt((point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]));
				 test[k].distance = distance;
				 for (m = 0;m < 3;m++)
				 {
				 test[k].pointa[m] = point[i][m];
				 }
				 for (m = 0;m < 3;m++)
				 {
				 test[k].pointb[m] = point[j][m];
				 }
				 k++;
			}
		}

			for (i = 0; i < n * (n - 1) / 2 - 1 ; i++)
			{
				  for (j = 0; j < n * (n - 1) / 2 - i - 1 ; j++)
				  {
						if (test[j].distance < test[j + 1].distance)
						{
							 _DISTANCE temp = test[j + 1];
							  test[j + 1] = test[j];
							  test[j] = temp;
						}
				  }
			}


		  for (k = 0;k < n * (n - 1) / 2;k++)
		  {
			 System.out.print("(");
			 System.out.print(test[k].pointa[0]);
			 System.out.print(",");
			 System.out.print(test[k].pointa[1]);
			 System.out.print(",");
			 System.out.print(test[k].pointa[2]);
			 System.out.print(")");
			 System.out.print("-");
			 System.out.print("(");
			 System.out.print(test[k].pointb[0]);
			 System.out.print(",");
			 System.out.print(test[k].pointb[1]);
			 System.out.print(",");
			 System.out.print(test[k].pointb[2]);
			 System.out.print(")");
			 System.out.print("=");
			 System.out.printf("%.2f\n",test[k].distance);
		  }

	}
}

