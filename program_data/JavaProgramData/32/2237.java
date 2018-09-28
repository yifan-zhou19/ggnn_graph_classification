package <missing>;

public class GlobalMembers
{
	public static int maxi(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
	   int n;
	   int i;
	   String a = new String(new char[102]);
	   String b = new String(new char[102]);
	   int[] na = new int[102];
	   int[] nb = new int[102];
	   int[] sum = new int[200];
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		   int j;
		   int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(na,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(nb,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(sum,0,(Integer.SIZE / Byte.SIZE));
		   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   int lena = a.length();
		   int lenb = b.length();
		   for (j = lena - 1;j >= 0;j--)
		   {
			   na[k++] = a.charAt(j) - '0';
		   }
		   k = 0;
		   for (j = lenb - 1;j >= 0;j--)
		   {
			  nb[k++] = b.charAt(j) - '0';
		   }
		   int MaxLen = maxi(lena, lenb);
		   for (j = 0;j < MaxLen;j++)
		   {
			   sum[j] += na[j] - nb[j];
			   if (sum[j] < 0)
			   {
					 sum[j] += 10;
					sum[j + 1]--;
			   }
		   }
		   int flag = 0;
		   for (j = MaxLen - 1;j >= 0;j--)
		   {
			   if (sum[j] == 0 && flag == 0)
			   {
							;
			   }
			   if (sum[j] != 0 && flag == 0)
			   {
				   flag = 1;
				   System.out.print(sum[j]);
			   }
			   else if (flag == 1)
			   {
			   System.out.print(sum[j]);
			   }
		   }
		   System.out.print("\n");
	   }
	   return 0;




	}

}

