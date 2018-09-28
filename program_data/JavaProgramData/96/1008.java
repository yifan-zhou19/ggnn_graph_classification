package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String s = new String(new char[101]);
		 int[] a = new int[101];
		 int[] b = new int[101];
		 int i;
		 int j;
		 int length;
		 int x;
		 int k;

		 s = new Scanner(System.in).nextLine();
		 length = s.length();
		 for (i = 0;i < length;i++)
		 {
			 a[i] = s.charAt(i) - '0';
		 }
		 if (length == 1)
		 {
			 System.out.print("0\n");
			 System.out.printf("%d",a[0]);
		 }
		 else
		 {
		 for (i = 0;i < length - 1;i++)
		 {
			 if (i == 0)
			 {
				 k = 10 * a[i] + a[i + 1];
			 }
			 else
			 {
				 k = 100 * a[i - 1] + 10 * a[i] + a[i + 1];
			 }
			 if (k >= 13)
			 {
				 //printf("***%d***%d\n",k,i);
				 b[i] = (k) / 13;
				 a[i + 1] = (k % 13) % 10;
				 a[i] = (k % 13) / 10;
			 }
			 else
			 {
				 x = k;
				 //printf("***%d***%d\n",x,i);
				 do
				 {
					 b[i] = 0;
					 if (i == length - 2)
					 {
						 b[length - 1] = 0;
						 break;
					 }
					 x = 10 * x + a[i + 2];
					 //printf("***%d***%d\n",x,i);
					 i++;
				 } while (x < 13);
				 b[i] = x / 13;
				 a[i + 1] = (x % 13) % 10;
				 a[i] = (x % 13) / 10;
			 }
		 }
		 if (b[0] != 0 || length == 2)
		 {
			 System.out.printf("%d",b[0]);
		 }

		 for (i = 1;i < length - 1;i++)
		 {
			 System.out.printf("%d",b[i]);
		 }
		 System.out.print("\n");
		 if (a[length - 2] != 0)
		 {
			 System.out.printf("%d",a[length - 2]);
		 }
		 System.out.printf("%d",a[length - 1]);
		 }
		 return 0;
	}



}
