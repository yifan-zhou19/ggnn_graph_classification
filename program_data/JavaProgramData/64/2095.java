package <missing>;

public class GlobalMembers
{
	//********************************
	//*????***********************
	//*??? 1300012920**************
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int z;
		int cnt = 0;
		//???????"zuobiao"????????
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	zuobiao[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int x1;
	//		int y1;
	//		int z1;
	//		int x2;
	//		int y2;
	//		int z2;
	//		int num1;
	//		int num2;
	//		double len;
	//	}
	//	len[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++) //??????
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zuobiao[i].x = x;
			zuobiao[i].y = y;
			zuobiao[i].z = z;
		}
		//???????????????????????len?
		for (i = 0 ; i < n - 1 ; i++)
		{
			for (j = i + 1 ; j < n ; j++)
			{
				len[cnt].x1 = zuobiao[i].x;
				len[cnt].y1 = zuobiao[i].y;
				len[cnt].z1 = zuobiao[i].z;
				len[cnt].x2 = zuobiao[j].x;
				len[cnt].y2 = zuobiao[j].y;
				len[cnt].z2 = zuobiao[j].z;
				len[cnt].num1 = i;
				len[cnt].num2 = j;
				len[cnt].len = Math.sqrt((zuobiao[i].x - zuobiao[j].x) * (zuobiao[i].x - zuobiao[j].x) + (zuobiao[i].y - zuobiao[j].y) * (zuobiao[i].y - zuobiao[j].y) + (zuobiao[i].z - zuobiao[j].z) * (zuobiao[i].z - zuobiao[j].z));
				cnt++;
			}
		}
		for (i = 0 ; i < (n - 1) * n / 2 - 1 ; i++)
		{
			for (j = i + 1 ; j < (n - 1) * n / 2 ; j++)
			{
				//????????????len[]????
				if (len[i].len < len[j].len)
				{
					len[50] = len[i];
					len[i] = len[j];
					len[j] = len[50];
				}
				//???????????????
				if (len[i].len == len[j].len && len[i].num1 > len[j].num1)
				{
					len[50] = len[i];
					len[i] = len[j];
					len[j] = len[50];
				}
				//????????????????????????
				if (len[i].len == len[j].len && len[i].num1 == len[j].num1 && len[i].num2 > len[j].num2)
				{
					len[50] = len[i];
					len[i] = len[j];
					len[j] = len[50];
				}

			}
		}
		for (j = 0 ; j < n * (n - 1) / 2 ; j++)
		{
			System.out.printf("%f", "(");
			System.out.printf("%f", len[j].x1);
			System.out.printf("%f", ",");
			System.out.printf("%f", len[j].y1);
			System.out.printf("%f", ",");
			System.out.printf("%f", len[j].z1);
			System.out.printf("%f", ")-(");
			System.out.printf("%f", len[j].x2);
			System.out.printf("%f", ",");
			System.out.printf("%f", len[j].y2);
			System.out.printf("%f", ",");
			System.out.printf("%f", len[j].z2);
			System.out.printf("%f", ")=");
			System.out.printf("%.2f", len[j].len);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

