package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int i;
		int[] in = new int[6];
		int[] out = new int[6];
		for (i = 0;i < 6;i++)
		{
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			out[i] = reverse(in[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.print(out[i]);
			System.out.print("\n");
		}
		return 0;
	}

	public static int reverse(int num)
	{
		int input;
		int[] output = new int[100];
		int result = 0;
		int i;
		int n1;
		int n2;
		int p;
		//if(num<0){
		//	input=-num;
		//	p=0;}
		//else{
			input = num;
		//	p=1;}
		for (i = 0;i < 100;i++)
		{
			if (input != 0)
			{
				output[i] = input % 10;
				input = input / 10;
			}
			else
			{
				break;
			}
		}
		n1 = i;
		for (i = 0;i < n1;i++)
		{
			if (output[i] != 0)
			{
				break;
			}
		}
		n2 = i;
		for (i = n2;i < n1;i++)
		{
			result = result + output[i] * Math.pow(10.0,n1 - 1 - i);
		}
		//if(p=0)
		//	result=0-result;
		//else
		//	result=result;
		return result;
	}


}

