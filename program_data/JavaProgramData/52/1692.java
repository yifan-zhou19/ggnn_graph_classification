package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int[] a = new int[MAX];

		int n;
		int m;
		int i;
		int temp;




		int flag;
		int istart;
		int iend;
		int length;

				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
		//????
		for (i = 0;i < n;i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
		}


		temp = n - m;
		if (n - m > m)
		{
			flag = 0; //<------
			length = m;
			istart = 0;
			iend = n - 1;
		}
		else
		{
			flag = 1; //----->
			length = n - m;
			istart = 0;
			iend = n - 1;
		}


		while (length > 1)
		{


			 /*
			 ??a[temp....temp+
			 swap(a,startpos,length);
			 */
			if (flag == 0)
			{
				 i = iend - length - length + 1;
				 for (;i < iend - length + 1;i++)
				 {
				   //???2*length

				   temp = a[i];
				   a[i] = a[i + length];
				   a[i + length] = temp;

				 }
				 iend = iend - length;


				 /*??????????*/

				 if (iend - length + 1 <= istart + length - 1)

				 {
					 flag = 1;
					 length = iend - length + 1 - istart;
				 }

			}
			else
			{ //*flag==1*

				 i = istart;
				 for (;i < istart + length;i++)
				 {
				   //???2*length

				   temp = a[i];
				   a[i] = a[i + length];
				   a[i + length] = temp;

				 }
				 istart = istart + length;

				 /*??????????*/
				 if (iend - length + 1 <= istart + length - 1)

				 {
					 flag = 0;
					 length = iend - length + 1 - istart;
				 }


			}









		} //end while



		 if (length == 1)

		 {

			if (flag == 0)
			{
				  temp = a[iend];
				  for (i = iend;i > istart;i--)
				  {
					a[i] = a[i - 1];
				  }
				  a[istart] = temp;

			}
			else
			{
				   temp = a[istart];
				  for (i = istart;i < iend;i++)
				  {
					a[i] = a[i + 1];
				  }
				  a[iend] = temp;

			}

		 }

		for (i = 0;i < n - 1;i++)
		{
			 System.out.printf("%d ",a[i]);
		}


		System.out.printf("%d",a[i]);














	}
}

