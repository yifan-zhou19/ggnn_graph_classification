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
		int i;
		int[] sum = new int[26];
		int m;
		int j;
		int max = 0;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char au[27];
	//		int l;
	//	};
		book[] bk = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bk[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk[i].au = tempVar3;
			}
			bk[i].l = String.valueOf(bk[i].au).length();
			for (j = 0; j < bk[i].l; j++)
			{
				switch (bk[i].au[j])
				{
				case 'A':
					sum[0] += 1;
					break;
				case 'B':
					sum[1] += 1;
					break;
				case 'C':
					sum[2] += 1;
					break;
				case 'D':
					sum[3] += 1;
					break;
				case 'E':
					sum[4] += 1;
					break;
				case 'F':
					sum[5] += 1;
					break;
				case 'G':
					sum[6] += 1;
					break;
				case 'H':
					sum[7] += 1;
					break;
				case 'I':
					sum[8] += 1;
					break;
				case 'J':
					sum[9] += 1;
					break;
				case 'K':
					sum[10] += 1;
					break;
				case 'L':
					sum[11] += 1;
					break;
				case 'M':
					sum[12] += 1;
					break;
				case 'N':
					sum[13] += 1;
					break;
				case 'O':
					sum[14] += 1;
					break;
				case 'P':
					sum[15] += 1;
					break;
				case 'Q':
					sum[16] += 1;
					break;
				case 'R':
					sum[17] += 1;
					break;
				case 'S':
					sum[18] += 1;
					break;
				case 'T':
					sum[19] += 1;
					break;
				case 'U':
					sum[20] += 1;
					break;
				case 'V':
					sum[21] += 1;
					break;
				case 'W':
					sum[22] += 1;
					break;
				case 'X':
					sum[23] += 1;
					break;
				case 'Y':
					sum[24] += 1;
					break;
				case 'Z':
					sum[25] += 1;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


