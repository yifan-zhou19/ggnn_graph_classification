int main()
{
	int n, a, b, c, d, e, f, g;
	scanf("%d", &n);
	if(n>100000){
		a=n/100000;
		b=(n%100000)/10000;
		c=(n%10000)/1000;
		d=(n%1000)/100;
		e=(n%100)/10;
		f=n%10;
		g=a+b*10+c*100+d*1000+e*10000+f*100000;
	}
	if(n>10000&&n<100000){
        b=n/10000;
		c=(n%10000)/1000;
		d=(n%1000)/100;
		e=(n%100)/10;
		f=n%10;
		g=b+c*10+d*100+e*1000+f*10000;
	}
	if(n>1000&&n<10000){
        c=n/1000;
		d=(n%1000)/100;
		e=(n%100)/10;
		f=n%10;
		g=c+d*10+e*100+f*1000;
	}
	if(n>100&&n<1000){
        d=n/100;
		e=(n%100)/10;
		f=n%10;
		g=d+e*10+f*100;
	}
	if(n>10&&n<100){
        e=n/10;
		f=n%10;
		g=e+f*10;
	}
	if(n<10){
		g=n;
	}
	printf("%d", g);
	return 0;
}




