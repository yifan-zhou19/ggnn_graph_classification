package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row; //??????????100?100???????
		int col;
		int[][] array = new int[100][100];
		int i;
		int j;
		int l;
		int t;
		int count1;
		int count2;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++) //????
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	   for (i = row - 1, j = col - 1, t = 0, count1 = row, count2 = col;count1 > 0 && count2 > 0;count1 = count1 - 2, count2 = count2 - 2, t++) //???????t??????????count1?count2??????????????????????
	   {
		   /*cout<<"****"<<"count1="<<count1<<' '<<"count2="<<count2<<' '<<"t="<<t<<endl;
		   cout<<"l1="<<l<<endl;*/
		   for (l = t;l < j - t;l++) //??????????�?�
		   {
				   System.out.print(array[t][l]);
				   System.out.print("\n");
			   /*cout<<"***";*/
		   }
		   /*cout<<"l2="<<l<<endl;*/
		   for (l = t;l < i - t;l++) //?????�?�
		   {
				   System.out.print(array[l][j - t]);
				   System.out.print("\n");
			   /*cout<<"***2";*/
		   }
		   if (count1 != 1)
		   {
		   for (l = j - t;l > t;l--) //?????�?�
		   {
				   System.out.print(array[i - t][l]);
				   System.out.print("\n");
		   /*cout<<"***3";*/
		   }
		   }
		   else if (count2 != 1)
		   {
			   System.out.print(array[i - t][j - t]);
		   }
		   if (count2 != 1)
		   {
		   for (l = i - t;l > t;l--) //?????�?�
		   {
			   System.out.print(array[l][t]);
			   System.out.print("\n");
		   /*cout<<"***4";*/
		   }
		   }
			  else if (count1 != 1)
			  {
				  System.out.print(array[i - t][t]);
			  }
		   if (count1 == 1 && count2 == 1)
		   {
			   System.out.print(array[t][j - t]);
		   }
		   /*cout<<'*'<<"count1="<<count1<<' '<<"count2="<<count2<<' '<<"t="<<t<<endl;*/
	   }
	   /*cout<<"**"<<"count1="<<count1<<' '<<"count2="<<count2<<' '<<"t="<<t<<endl;*/
	   return 0;
	}
}

