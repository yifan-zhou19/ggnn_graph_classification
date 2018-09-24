//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class info
{
	public short num;
	public String author = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char findoutmax = new char(struct info a[],int n,int * pt);
		void detect(struct info b[],char writter,int nn);
		char figure;
		int i;
		int n_book;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		info[] book = tangible.Arrays.initializeWithDefaultinfoInstances(999);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n_book = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n_book;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Short.parseShort(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
		}
		p = max;
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		figure = findoutmax(book, n_book, tempRef_p);
		p = tempRef_p.argValue;
		System.out.printf("%c\n%d\n",figure,max);
		detect(book, figure, n_book);
		return 0;
	}

	public static char findoutmax(info[] a, int n, tangible.RefObject<Integer> pt)
	{
		int i;
		int j;
		int[] sum = new int[26];
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i].author.charAt(j) != '\0';j++)
			{
				switch (a[i].author.charAt(j))
				{
				case 'A':
					sum[0] = sum[0] + 1;
					break;
				case 'B':
					sum[1] = sum[1] + 1;
					break;
				case 'C':
					sum[2] = sum[2] + 1;
					break;
				case 'D':
					sum[3] = sum[3] + 1;
					break;
				case 'E':
					sum[4] = sum[4] + 1;
					break;
				case 'F':
					sum[5] = sum[5] + 1;
					break;
				case 'G':
					sum[6] = sum[6] + 1;
					break;
				case 'H':
					sum[7] = sum[7] + 1;
					break;
				case 'I':
					sum[8] = sum[8] + 1;
					break;
				case 'J':
					sum[9] = sum[9] + 1;
					break;
				case 'K':
					sum[10] = sum[10] + 1;
					break;
				case 'L':
					sum[11] = sum[11] + 1;
					break;
				case 'M':
					sum[12] = sum[12] + 1;
					break;
				case 'N':
					sum[13] = sum[13] + 1;
					break;
				case 'O':
					sum[14] = sum[14] + 1;
					break;
				case 'P':
					sum[15] = sum[15] + 1;
					break;
				case 'Q':
					sum[16] = sum[16] + 1;
					break;
				case 'R':
					sum[17] = sum[17] + 1;
					break;
				case 'S':
					sum[18] = sum[18] + 1;
					break;
				case 'T':
					sum[19] = sum[19] + 1;
					break;
				case 'U':
					sum[20] = sum[20] + 1;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


