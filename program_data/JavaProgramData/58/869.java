import java.util.*;

int anyil = new int(char*,int);
int first = char;
int main()
{
	int i;
	int j;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	for (i = 0;i < n;i++)
	{
		String str = new String(new char[1000]);
		int i;
		int l;
		int out;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++) //????
		{
		l = i + 1;
		}
		out = anyil(str,l) && first(str.charAt(0)); //????out?1
		System.out.print(out);
		System.out.print("\n");
	}
	return 0;
}
int anyil(char x[],int l) //??????????????????1
{
	int i;
	int flag = 1;
	for (i = 0;i < l;i++)
	{
		if (x[i] == '_' || (x[i] >= '0' && x[i] <= '9') || (x[i] >= 'a' && x[i] <= 'z') || (x[i] >= 'A' && x[i] <= 'Z'))
		{
			;
		}
		else
		{
			flag = 0;
		}
	}
	return flag;
}
int first(char x) //??????????????????1
{
	int flag;
	if (x == '_' || (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
	{
		flag = 1;
	}
	else
	{
		flag = 0;
	}
	return flag;
}



