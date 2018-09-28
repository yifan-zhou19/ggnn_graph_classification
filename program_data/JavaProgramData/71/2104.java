//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] year = new int[200];
		int[] mon1 = new int[200];
		int[] mon2 = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				mon1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				mon2[i] = Integer.parseInt(tempVar4);
			}
		}

		for (i = 1;i <= n;i++)
		{
			if ((year[i] % 100 != 0) && (year[i] % 4 == 0) || year[i] % 400 == 0)
			{

			if (mon1[i] == 1)
			{
				mon1[i] = 1;
			}
			if (mon1[i] == 2)
			{
				mon1[i] = 32;
			}
			if (mon1[i] == 3)
			{
				mon1[i] = 61;
			}
			if (mon1[i] == 4)
			{
				mon1[i] = 92;
			}
			if (mon1[i] == 5)
			{
				mon1[i] = 122;
			}
			if (mon1[i] == 6)
			{
				mon1[i] = 153;
			}
			if (mon1[i] == 7)
			{
				mon1[i] = 183;
			}
			if (mon1[i] == 8)
			{
				mon1[i] = 214;
			}
			if (mon1[i] == 9)
			{
				mon1[i] = 245;
			}
			if (mon1[i] == 10)
			{
				mon1[i] = 275;
			}
			if (mon1[i] == 11)
			{
				mon1[i] = 306;
			}
			if (mon1[i] == 12)
			{
				mon1[i] = 336;
			}
			if (mon2[i] == 1)
			{
				mon2[i] = 1;
			}
			if (mon2[i] == 2)
			{
				mon2[i] = 32;
			}
			if (mon2[i] == 3)
			{
				mon2[i] = 61;
			}
			if (mon2[i] == 4)
			{
				mon2[i] = 92;
			}
			if (mon2[i] == 5)
			{
				mon2[i] = 122;
			}
			if (mon2[i] == 6)
			{
				mon2[i] = 153;
			}
			if (mon2[i] == 7)
			{
				mon2[i] = 183;
			}
			if (mon2[i] == 8)
			{
				mon2[i] = 214;
			}
			if (mon2[i] == 9)
			{
				mon2[i] = 245;
			}
			if (mon2[i] == 10)
			{
				mon2[i] = 275;
			}
			if (mon2[i] == 11)
			{
				mon2[i] = 306;
			}
			if (mon2[i] == 12)
			{
				mon2[i] = 336;
			}
			if (((mon2[i] - mon1[i]) % 7 == 0) || ((mon1[i] - mon2[i]) % 7 == 0))
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			}
			else
			{
			if (mon1[i] == 1)
			{
				mon1[i] = 1;
			}
			if (mon1[i] == 2)
			{
				mon1[i] = 32;
			}
			if (mon1[i] == 3)
			{
				mon1[i] = 60;
			}
			if (mon1[i] == 4)
			{
				mon1[i] = 91;
			}
			if (mon1[i] == 5)
			{
				mon1[i] = 121;
			}
			if (mon1[i] == 6)
			{
				mon1[i] = 152;
			}
			if (mon1[i] == 7)
			{
				mon1[i] = 182;
			}
			if (mon1[i] == 8)
			{
				mon1[i] = 213;
			}
			if (mon1[i] == 9)
			{
				mon1[i] = 244;
			}
			if (mon1[i] == 10)
			{
				mon1[i] = 274;
			}
			if (mon1[i] == 11)
			{
				mon1[i] = 305;
			}
			if (mon1[i] == 12)
			{
				mon1[i] = 335;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


