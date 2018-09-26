package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		float first;
	//		float second;
	//		float distance;
	//	}
	//	b[100],temp;
		float[][] a = new float[11][3];
		int p;
		int q;
		int n;
		int k = 0;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				a[i][j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[k].first = i;
				b[k].second = j;
				b[k].distance = Math.sqrt(Math.abs(Math.pow((a[i][0] - a[j][0]),2) + Math.pow((a[i][1] - a[j][1]),2) + Math.pow((a[i][2] - a[j][2]),2)));
				k++;
			}
		}
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = n * (n - 1) / 2 - 1;j > i;j--)
			{
				if (b[j].distance > b[j - 1].distance)
				{
					temp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = temp;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			p = b[i].first;
			q = b[i].second;
			System.out.print("(");
			System.out.print(a[p][0]);
			System.out.print(",");
			System.out.print(a[p][1]);
			System.out.print(",");
			System.out.print(a[p][2]);
			System.out.print(")-(");
			System.out.print(a[q][0]);
			System.out.print(",");
			System.out.print(a[q][1]);
			System.out.print(",");
			System.out.print(a[q][2]);
			System.out.print(")=");
			System.out.printf("%.2f", b[i].distance);
			System.out.printf("%f", "\n");
		}
		return 0;
	}











}

