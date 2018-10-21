//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int[][] sum = new int[1001][1001];
	public static int[] s = new int[1001];
	public static int[] s1 = new int[1001];

	public static int max(int x,int y)
	{
		if (x > y)
		{
			return (x);
		}
		else
		{
			return (y);
		}
	}



	public static void pai(int i,int j)
	{
		int i1 = i;
		int j1 = j;
		int tmp = s[i];
		while (i < j)
		{
			while (i < j && s[j] < tmp)
			{
				j--;
			}
			if (i < j)
			{
				s[i++] = s[j];
			}
			while (i < j && s[i]> tmp)
			{
				i++;
			}
			if (i < j)
			{
				s[j--] = s[i];
			}
		}
		s[i] = tmp;
		if (i1 < i - 1)
		{
			pai(i1, i - 1);
		}
		if (j + 1 < j1)
		{
			pai(j + 1, j1);
		}
	}

	public static void pai1(int i,int j)
	{
		int i1 = i;
		int j1 = j;
		int tmp = s1[i];
		while (i < j)
		{
			while (i < j && s1[j] < tmp)
			{
				j--;
			}
			if (i < j)
			{
				s1[i++] = s1[j];
			}
			while (i < j && s1[i]> tmp)
			{
				i++;
			}
			if (i < j)
			{
				s1[j--] = s1[i];
			}
		}
		s1[i] = tmp;
		if (i1 < i - 1)
		{
			pai1(i1, i - 1);
		}
		if (j + 1 < j1)
		{
			pai1(j + 1, j1);
		}
	}





	public static void Main()
	{
	  int zong;
	  int i = 0;
	  int j;
	  int n;
	  int temp;
	  int temp1;
	  int temp2;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n != 0)
	  {
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s[i] = Integer.parseInt(tempVar2);
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 s1[i] = Integer.parseInt(tempVar3);
			 }
		 }

		 pai(0, n - 1);
		 pai1(0, n - 1);
		 j = 0;

		 if (s[0] > s1[0])
		 {
			 sum[1][n] = 1;
		 }
		 else if (s[0] == s1[0])
		 {
			 sum[1][n] = 0;
		 }
		 else
		 {
			 sum[1][n] = -1;
		 }
		 if (s[n - 1] > s1[0])
		 {
			 sum[0][n - 1] = 1;
		 }
		 else if (s[n - 1] == s1[0])
		 {
			 sum[0][n - 1] = 0;
		 }
		 else
		 {
			 sum[0][n - 1] = -1;
		 }
		 for (i = 1;i < n;i++)
		 {
			for (j = 0;j <= i;j++)
			{

				if (s[n + j - i - 1] > s1[i])
				{
					temp = sum[j][n + j - i] + 1;
				}
					 else if (s[n + j - i - 1] == s1[i])
					 {
						 temp = sum[j][n + j - i];
					 }
					  else
					  {
						  temp = sum[j][n + j - i] - 1;
					  }

				if (j > 0)
				{
					sum[j][n + j - i - 1] = max(temp, sum[j][n + j - i - 1]);
				}
				 else
				 {
					 sum[j][n + j - i - 1] = temp;
				 }

				if (s[j] > s1[i])
				{
					sum[j + 1][n + j - i] = sum[j][n + j - i] + 1;
				}
					 else if (s[j] == s1[i])
					 {
						 sum[j + 1][n + j - i] = sum[j][n + j - i];
					 }
					  else
					  {
						  sum[j + 1][n + j - i] = sum[j][n + j - i] - 1;
					  }
			}
		 }
		 zong = sum[1][1];

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


