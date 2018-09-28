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
		int j;
		int k;
		int l;
		int m;
		int[] rank = new int[6];
		int[] word = new int[6];
		for (i = 1;i <= 5;i++)
		{
		 for (j = 1;j <= 5;j++)
		 {
		  for (k = 1;k <= 5;k++)
		  {
		   for (l = 1;l <= 5;l++)
		   {
			if (l == i)
			{
				continue;
			}
			for (m = 1;m <= 5;m++)
			{
				if ((m == 2) || (m == 3) || (m == l) || (m == i))
				{
				continue;
				}
				word[1] = (m == 1);
				word[2] = (j == 2);
				word[3] = (i == 5);
				word[4] = (k != 1);
				word[5] = (l == 1);
				if ((i == 1) && (j == 2) && (word[1] == 1) && (word[2] == 1) && (word[3] == 0) && (word[4] == 0) && (word[5] == 0))
				{
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				}
				if ((i == 1) && (k == 2) && (word[1] == 1) && (word[2] == 0) && (word[3] == 1) && (word[4] == 0) && (word[5] == 0))
				{
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				}
				if ((i == 1) && (l == 2) && (word[1] == 1) && (word[2] == 0) && (word[3] == 0) && (word[4] == 1) && (word[5] == 0))
				{
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				}
				if ((j == 1) && (i == 2) && (word[1] == 1) && (word[2] == 1) && (word[3] == 0) && (word[4] == 0) && (word[5] == 0))
				{
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				}
				if ((j == 1) && (k == 2) && (word[1] == 0) && (word[2] == 1) && (word[3] == 1) && (word[4] == 0) && (word[5] == 0))
				{
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				}
				if ((j == 1) && (l == 2) && (word[1] == 0) && (word[2] == 1) && (word[3] == 0) && (word[4] == 1) && (word[5] == 0))
				{
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				}
				if ((k == 1) && (i == 2) && (word[1] == 1) && (word[2] == 0) && (word[3] == 1) && (word[4] == 0) && (word[5] == 0))
				{
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				}
				 if ((k == 1) && (j == 2) && (word[1] == 0) && (word[2] == 1) && (word[3] == 1) && (word[4] == 0) && (word[5] == 0))
				 {
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				 }
				 if ((k == 1) && (l == 2) && (word[1] == 0) && (word[2] == 0) && (word[3] == 1) && (word[4] == l) && (word[5] == 0))
				 {
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				 }
				 if ((l == 1) && (i == 2) && (word[1] == 1) && (word[2] == 0) && (word[3] == 0) && (word[4] == 1) && (word[5] == 0))
				 {
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;
					  break;
				 }
				 if ((l == 1) && (j == 2) && (word[1] == 0) && (word[2] == 1) && (word[3] == 0) && (word[4] == 1) && (word[5] == 0))
				{
					  rank[1] = i;
					  rank[2] = j;
					  rank[3] = k;
					  rank[4] = l;
					  rank[5] = m;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
