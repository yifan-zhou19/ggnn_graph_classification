package <missing>;

public class GlobalMembers
{
	public static int geshu; //?????
	public static void yinshu(int num,int a) //??????
	{
		 int i; //???
		 if (num == 1)
		 {
			 geshu++; //?1??????
		 }
		 else
		 {
			  for (i = a;i <= num;i++)
			  {

							if (num % i == 0) //???????
							{
																	//cout<<"neibu???"<<i<<" "<<endl;
										 yinshu(num / i, i); //?num/i?????
							}
			  }
		 }
	}
	public static int Main()
	{
		int shu; //shu??????j??????num?????
		int j;
		int[] num1 = new int[10000];
		shu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < shu;j++)
		{
						  geshu = 0;
						  num1[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						  //cout<<"???"<<j<<" "; 
						  yinshu(num1[j], 2); //?????
						  System.out.print(geshu);
						  System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

